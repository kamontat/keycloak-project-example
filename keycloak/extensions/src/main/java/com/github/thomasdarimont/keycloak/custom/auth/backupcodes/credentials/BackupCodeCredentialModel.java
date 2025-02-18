package com.github.thomasdarimont.keycloak.custom.auth.backupcodes.credentials;

import com.github.thomasdarimont.keycloak.custom.auth.backupcodes.BackupCode;
import org.keycloak.credential.CredentialModel;

@Deprecated
public class BackupCodeCredentialModel extends CredentialModel {

    public static final String TYPE = "backup-code";

    private final BackupCode backupCode;

    public BackupCodeCredentialModel(BackupCode backupCode) {
        this.backupCode = backupCode;
    }

    public BackupCode getBackupCode() {
        return backupCode;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
