package com.hostit.exhibitionplatform.domain.auth.exception.oauth;

import com.hostit.exhibitionplatform.domain.auth.exception.CustomAuthException;
import com.hostit.exhibitionplatform.global.error.ErrorCdoe;

public class InvalidLoginRedirectUriException extends CustomAuthException {
    private final ErrorCdoe errorCdoe;
    private final String detailMessage;

    public InvalidLoginRedirectUriException(ErrorCdoe errorCode) {
        super(errorCode);
        this.errorCdoe = errorCode;
        this.detailMessage = errorCode.getMessage();
    }

    public InvalidLoginRedirectUriException(ErrorCdoe errorCode, String detailMessage) {
        super(errorCode);
        this.errorCdoe = errorCode;
        this.detailMessage = detailMessage;
    }
}
