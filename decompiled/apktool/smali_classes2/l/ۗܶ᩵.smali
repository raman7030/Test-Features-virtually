.class public abstract Ll/ۗܶ᩵;
.super Ljava/lang/Object;
.source "VAZ3"

# interfaces
.implements Ll/ܿ᩸᩵;


# instance fields
.field public final ᩸:Ll/ܽ᩶᩵;

.field public final ᩹:Ll/ܿ᩸᩵;


# direct methods
.method public constructor <init>(Ll/ܿ᩸᩵;Ll/ܺ᩹᩵;)V
    .locals 1

    const-string v0, "baseKey"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    check-cast p2, Ll/ܽ᩶᩵;

    iput-object p2, p0, Ll/ۗܶ᩵;->᩸:Ll/ܽ᩶᩵;

    .line 54
    instance-of p2, p1, Ll/ۗܶ᩵;

    if-eqz p2, :cond_0

    check-cast p1, Ll/ۗܶ᩵;

    iget-object p1, p1, Ll/ۗܶ᩵;->᩹:Ll/ܿ᩸᩵;

    :cond_0
    iput-object p1, p0, Ll/ۗܶ᩵;->᩹:Ll/ܿ᩸᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗ᩵;)Ll/ᩳ᩸᩵;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۗܶ᩵;->᩸:Ll/ܽ᩶᩵;

    invoke-interface {v0, p1}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩸᩵;

    return-object p1
.end method

.method public final ֫(Ll/ܿ᩸᩵;)Z
    .locals 1

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_1

    .line 57
    iget-object v0, p0, Ll/ۗܶ᩵;->᩹:Ll/ܿ᩸᩵;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
