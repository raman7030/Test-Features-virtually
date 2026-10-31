.class public final Ll/᩸ۡ֡;
.super Ljava/lang/Object;
.source "V7IW"

# interfaces
.implements Ll/ܶۡ֡;
.implements Ljava/io/Closeable;


# instance fields
.field public final ᩸:Ll/ܿ᩺ᩴ;


# direct methods
.method public constructor <init>(Ll/ܿ᩺ᩴ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/᩸ۡ֡;->᩸:Ll/ܿ᩺ᩴ;

    return-void
.end method

.method public static ֫(Ll/ܿ᩺ᩴ;)Ll/ܶۡ֡;
    .locals 1

    if-eqz p0, :cond_0

    .line 32
    new-instance v0, Ll/᩸ۡ֡;

    invoke-direct {v0, p0}, Ll/᩸ۡ֡;-><init>(Ll/ܿ᩺ᩴ;)V

    return-object v0

    .line 74
    :cond_0
    invoke-static {}, Ll/ܽ᩺ᩴ;->empty()Ll/ܿ᩺ᩴ;

    move-result-object p0

    invoke-static {p0}, Ll/᩸ۡ֡;->֫(Ll/ܿ᩺ᩴ;)Ll/ܶۡ֡;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩸ۡ֡;->᩸:Ll/ܿ᩺ᩴ;

    .line 54
    invoke-interface {v0}, Ll/۫ۨᩴ;->close()V

    return-void
.end method

.method public final ۧ()Ll/۫ۨᩴ;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩸ۡ֡;->᩸:Ll/ܿ᩺ᩴ;

    return-object v0
.end method
