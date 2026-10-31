.class public final Ll/֫ܰܺ;
.super Ljava/lang/Object;
.source "B3B1"


# instance fields
.field public final ֫:Ljava/lang/Throwable;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 153
    new-instance v0, Ll/֫ܰܺ;

    new-instance v1, Ll/۟᩺ܺ;

    const-string v2, "Failure occurred while trying to finish a future."

    .line 155
    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 153
    invoke-direct {v0, v1}, Ll/֫ܰܺ;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    iput-object p1, p0, Ll/֫ܰܺ;->֫:Ljava/lang/Throwable;

    return-void
.end method
