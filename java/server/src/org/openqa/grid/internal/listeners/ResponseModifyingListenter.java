package org.openqa.grid.internal.listeners;

import javax.servlet.http.HttpServletRequest;

import org.openqa.grid.internal.TestSession;

public interface ResponseModifyingListenter {
  /**
   * Executed after the request is sent to the node but before it's forwarded to
   * the remote. Modifying the response will change what the remote receives.
   * <p>
   * Throwing an exception will result in an error for the client.
   *
   * @param session session
   * @param request request
   * @param response response
   * @return 
   */
  public byte[] beforeForwardToRemoteEnd(TestSession session, HttpServletRequest request, byte[] response);
}
