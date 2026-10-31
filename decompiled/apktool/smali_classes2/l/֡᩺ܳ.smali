.class public final synthetic Ll/֡᩺ܳ;
.super Ljava/lang/Object;
.source "K7BU"

# interfaces
.implements Ll/ᩴ᩺ܳ;


# instance fields
.field public final synthetic ֫:Ll/ᩳۜܳ;

.field public final synthetic ۧ:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/֡᩺ܳ;->֫:Ll/ᩳۜܳ;

    iput-object p1, p0, Ll/֡᩺ܳ;->ۧ:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 7

    .line 74
    iget-object v0, p0, Ll/֡᩺ܳ;->֫:Ll/ᩳۜܳ;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 75
    invoke-interface {v0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v4, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move-object v4, v0

    :goto_0
    iget-object v2, p0, Ll/֡᩺ܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v2}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v5

    move-object v6, p1

    .line 74
    invoke-static/range {v1 .. v6}, Ll/֨᩺ܳ;->֫(Ljava/util/List;Ll/ܽۢܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/֨۠ۢ;

    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ll/֨۠ۢ;->֫()I

    return-void
.end method
