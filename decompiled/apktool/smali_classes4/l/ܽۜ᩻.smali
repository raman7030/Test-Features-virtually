.class public final Ll/ܽۜ᩻;
.super Ljava/lang/Object;
.source "D9TI"

# interfaces
.implements Ll/ۧܺۡ;


# instance fields
.field public final synthetic ֫:Ll/ᩳۜ᩻;

.field public final synthetic ۧ:Ll/ܶ᩵ܿ;

.field public final synthetic ܽ:Ll/ᩳۜܳ;

.field public final synthetic ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ᩳۜ᩻;Ljava/util/ArrayList;Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۜ᩻;->֫:Ll/ᩳۜ᩻;

    iput-object p2, p0, Ll/ܽۜ᩻;->ᩳ:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/ܽۜ᩻;->ܽ:Ll/ᩳۜܳ;

    iput-object p4, p0, Ll/ܽۜ᩻;->ۧ:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final getInputStream()Ljava/io/InputStream;
    .locals 6

    .line 260
    iget-object v0, p0, Ll/ܽۜ᩻;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/ܽۜ᩻;->ۧ:Ll/ܶ᩵ܿ;

    if-eqz v1, :cond_0

    .line 261
    iget-object v1, p0, Ll/ܽۜ᩻;->֫:Ll/ᩳۜ᩻;

    invoke-static {v1}, Ll/ᩳۜ᩻;->֫(Ll/ᩳۜ᩻;)Ll/۠ۢ᩻;

    move-result-object v1

    new-instance v3, Ll/ۧۜ᩻;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    .line 52
    iget-object v5, p0, Ll/ܽۜ᩻;->ܽ:Ll/ᩳۜܳ;

    invoke-virtual {v1, v5, v2, v4, v3}, Ll/۠ۢ᩻;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;ZLl/ۚ᩸ܿ;)V

    .line 263
    :cond_0
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v1

    .line 264
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public final length()J
    .locals 2

    .line 270
    iget-object v0, p0, Ll/ܽۜ᩻;->ܽ:Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic ֫()Ljava/io/InputStream;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֫ܺۡ;->֫(Ll/ۧܺۡ;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
