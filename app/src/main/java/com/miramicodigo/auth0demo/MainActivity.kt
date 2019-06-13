package com.miramicodigo.auth0demo

import android.app.Dialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.auth0.android.Auth0
import com.auth0.android.authentication.AuthenticationException
import com.auth0.android.provider.AuthCallback
import com.auth0.android.provider.WebAuthProvider
import com.auth0.android.result.Credentials
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var auth0: Auth0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener{
            login()
        }

        auth0 = Auth0(this)
        auth0.isOIDCConformant = true

    }

    private fun login() {
        tvToken.text = "Not logged in"
        WebAuthProvider.init(auth0)
            .withScheme("demo")
            .withAudience(String.format("https://%s/userinfo", getString(R.string.com_auth0_domain)))
            .start(this@MainActivity, object : AuthCallback {
                override fun onFailure(dialog: Dialog) {
                    runOnUiThread {
                        dialog.show()
                    }
                }

                override fun onFailure(exception: AuthenticationException) {
                    runOnUiThread {
                        Toast.makeText(this@MainActivity, "Error: " + exception.message, Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onSuccess(credentials: Credentials) {
                    runOnUiThread {
                        tvToken.text = "Logged in: " + credentials.accessToken!!
                    }
                }
            })
    }
}
