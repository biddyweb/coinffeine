package com.coinffeine.common.protocol.messages.brokerage

import com.coinffeine.common.FiatCurrency
import com.coinffeine.common.protocol.messages.PublicMessage

/** Used to ask about the current open orders of bitcoin traded in a given currency */
case class OpenOrders[C <: FiatCurrency](orders: PeerOrderRequests[C]) extends PublicMessage

object OpenOrders {
  def empty[C <: FiatCurrency](market: Market[C]): OpenOrders[C] =
    OpenOrders(PeerOrderRequests.empty(market))
}
