package com.example.gemini

import android.app.Application

class AntiGemApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Personal build (own signing key): telemetry is disabled and the
        // in-app auto-update check is off. TelemetryDeck would report to the
        // original developer, and the stock updater would offer the original
        // developer's releases, which cannot install over this build's
        // signature anyway. Everything else is unchanged.
    }
}
