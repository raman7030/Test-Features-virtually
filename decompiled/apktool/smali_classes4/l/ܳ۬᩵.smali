.class public final Ll/ܳ۬᩵;
.super Ljava/lang/RuntimeException;
.source "4AX2"


# instance fields
.field public final ᩸:Ll/ܳ᩸᩵;


# direct methods
.method public constructor <init>(Ll/ܳ᩸᩵;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    iput-object p1, p0, Ll/ܳ۬᩵;->᩸:Ll/ܳ᩸᩵;

    return-void
.end method


# virtual methods
.method public final fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p0
.end method

.method public final getLocalizedMessage()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ܳ۬᩵;->᩸:Ll/ܳ᩸᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
