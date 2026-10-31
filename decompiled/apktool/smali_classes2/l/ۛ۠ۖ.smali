.class public final Ll/ۛ۠ۖ;
.super Ljava/lang/RuntimeException;
.source "W64Z"


# static fields
.field public static final serialVersionUID:J = 0x575c09a848ef838dL


# direct methods
.method public varargs constructor <init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 68
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 55
    invoke-direct {p0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
