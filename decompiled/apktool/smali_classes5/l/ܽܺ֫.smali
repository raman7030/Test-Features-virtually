.class public final Ll/ܽܺ֫;
.super Ljava/lang/Object;
.source "MANZ"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final ᩸:Ll/ۡܺ֫;


# direct methods
.method public constructor <init>(Ll/ۡܺ֫;)V
    .locals 0

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    iput-object p1, p0, Ll/ܽܺ֫;->᩸:Ll/ۡܺ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 196
    sget-object v0, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    if-ne p2, v0, :cond_0

    .line 199
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    .line 203
    iget-object p1, p0, Ll/ܽܺ֫;->᩸:Ll/ۡܺ֫;

    invoke-virtual {p1}, Ll/ۡܺ֫;->ۧ()V

    return-void

    .line 197
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Next event must be ON_CREATE, it was "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 196
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
