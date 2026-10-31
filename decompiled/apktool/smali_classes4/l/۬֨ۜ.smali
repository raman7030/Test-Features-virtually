.class public final synthetic Ll/۬֨ۜ;
.super Ljava/lang/Object;
.source "K74T"

# interfaces
.implements Ll/ۛ֡ۜ;


# instance fields
.field public final synthetic ֫:Ll/ۨ֨ۜ;

.field public final synthetic ۧ:Ll/ܿ۠ۜ;

.field public final synthetic ܽ:Ll/ܶ۠֫;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ֨ۜ;Ll/ܿ۠ۜ;Ll/ܶ۠֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬֨ۜ;->֫:Ll/ۨ֨ۜ;

    iput-object p2, p0, Ll/۬֨ۜ;->ۧ:Ll/ܿ۠ۜ;

    iput-object p3, p0, Ll/۬֨ۜ;->ܽ:Ll/ܶ۠֫;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۟ܰۜ;
    .locals 3

    .line 2
    iget-object v0, p0, Ll/۬֨ۜ;->ܽ:Ll/ܶ۠֫;

    .line 353
    iget-object v1, p0, Ll/۬֨ۜ;->ۧ:Ll/ܿ۠ۜ;

    invoke-static {v1}, Ll/ܿ۠ۜ;->ᩳ(Ll/ܿ۠ۜ;)Ll/ܳ۠ۜ;

    move-result-object v1

    .line 354
    invoke-virtual {v1, v0}, Ll/ܳ۠ۜ;->֫(Ll/ܶ۠֫;)Ll/ۙ᩶ۜ;

    move-result-object v0

    .line 633
    new-instance v1, Ll/ۛ֨ۜ;

    iget-object v2, p0, Ll/۬֨ۜ;->֫:Ll/ۨ֨ۜ;

    invoke-virtual {v2, v0}, Ll/ۨ֨ۜ;->֫(Ljava/io/Closeable;)Ll/ۤ֨ۜ;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ll/ۛ֨ۜ;-><init>(Ll/۟ܰۜ;Ll/ۤ֨ۜ;)V

    return-object v1
.end method
