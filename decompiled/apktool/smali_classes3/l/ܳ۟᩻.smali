.class public final Ll/ܳ۟᩻;
.super Ljava/lang/RuntimeException;
.source "P77N"


# instance fields
.field public final ᩸:Ljava/lang/RuntimeException;


# direct methods
.method public constructor <init>(Ljava/lang/RuntimeException;)V
    .locals 1

    .line 5719
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5720
    iput-object p1, p0, Ll/ܳ۟᩻;->᩸:Ljava/lang/RuntimeException;

    return-void
.end method
