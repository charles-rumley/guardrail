package com.twilio.swagger.codegen
package terms.protocol

import _root_.io.swagger.models.ArrayModel
import cats.InjectK
import cats.free.Free
import scala.meta._

class ArrayProtocolTerms[F[_]](implicit I: InjectK[ArrayProtocolTerm, F]) {
  def extractArrayType(arr: ArrayModel, concreteTypes: List[PropMeta]): Free[F, Type] =
    Free.inject[ArrayProtocolTerm, F](ExtractArrayType(arr, concreteTypes))
}

object ArrayProtocolTerms {
  implicit def arrayProtocolTerms[F[_]](implicit I: InjectK[ArrayProtocolTerm, F]): ArrayProtocolTerms[F] = new ArrayProtocolTerms[F]
}
