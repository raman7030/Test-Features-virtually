.class public abstract Ll/ۙܶ᩵;
.super Ljava/lang/Object;
.source "VAZ3"

# interfaces
.implements Ll/ᩳ᩸᩵;


# instance fields
.field public final ᩸:Ll/ܿ᩸᩵;


# direct methods
.method public constructor <init>(Ll/ܿ᩸᩵;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۙܶ᩵;->᩸:Ll/ܿ᩸᩵;

    return-void
.end method


# virtual methods
.method public final getKey()Ll/ܿ᩸᩵;
    .locals 1

    .line 17
    iget-object v0, p0, Ll/ۙܶ᩵;->᩸:Ll/ܿ᩸᩵;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;
    .locals 0

    .line 70
    invoke-interface {p2, p1, p0}, Ll/᩵᩹᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge ֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 0

    .line 16
    invoke-static {p0, p1}, Ll/ܽ᩸᩵;->֫(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;
    .locals 1

    const-string v0, "key"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Ll/ۙܶ᩵;->getKey()Ll/ܿ᩸᩵;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 0

    .line 16
    invoke-static {p0, p1}, Ll/ܽ᩸᩵;->֫(Ll/ᩳ᩸᩵;Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method
