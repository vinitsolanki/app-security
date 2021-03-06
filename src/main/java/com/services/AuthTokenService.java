package com.services;

import com.entity.AuthToken;
import com.entity.User;

/**
 * @author Vinit Solanki
 *
 */
public interface AuthTokenService {

	public AuthToken save(AuthToken authToken);

	public void delete(AuthToken authToken);

	public AuthToken findFistByTokenAndRemoteAddress(final String token, final String remoteAddr);

	public AuthToken findFistByUserAndRemoteAddress(final User user, final String remoteAddress);

	public void processToGnerateAuthToken(User user, String token, String remoteAddress, String userAgent, boolean isRememberMe);

}
