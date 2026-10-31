.class public final synthetic Ll/ۖ᩺ܳ;
.super Ljava/lang/Object;
.source "L1Y0"

# interfaces
.implements Ll/ᩴ᩺ܳ;


# instance fields
.field public final synthetic ֫:Ll/ᩳۜܳ;

.field public final synthetic ۧ:Ll/ۖۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳۜܳ;Ll/ۖۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩺ܳ;->֫:Ll/ᩳۜܳ;

    iput-object p2, p0, Ll/ۖ᩺ܳ;->ۧ:Ll/ۖۢܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 5

    .line 27
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/ۡ᩺ܳ;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 28
    iget-object v1, p0, Ll/ۖ᩺ܳ;->֫:Ll/ᩳۜܳ;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 29
    iget-object v2, p0, Ll/ۖ᩺ܳ;->ۧ:Ll/ۖۢܳ;

    invoke-virtual {v0, v2}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    const-string v3, "ARG_MSG_FROM"

    .line 30
    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-interface {v1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "ARG_MSG_TO"

    .line 32
    invoke-virtual {v0, v1, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v1, "targetPath"

    .line 34
    invoke-virtual {v2}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "replacedName"

    .line 35
    invoke-virtual {v0, v1, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method
