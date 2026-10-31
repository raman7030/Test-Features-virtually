.class public final Ll/ۢۙ᩵;
.super Ljava/lang/Object;
.source "NAWS"

# interfaces
.implements Ll/ܳۙ᩵;


# instance fields
.field public final synthetic ֫:Ll/᩵᩹᩵;


# direct methods
.method public constructor <init>(Ll/᩵᩹᩵;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ۢۙ᩵;->֫:Ll/᩵᩹᩵;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 37
    new-instance v0, Ll/᩻ۙ᩵;

    .line 104
    invoke-direct {v0}, Ll/ۜۙ᩵;-><init>()V

    .line 38
    iget-object v1, p0, Ll/ۢۙ᩵;->֫:Ll/᩵᩹᩵;

    invoke-static {v1, v0, v0}, Ll/᩹ܽܽ;->֫(Ll/᩵᩹᩵;Ljava/lang/Object;Ll/ۨܶ᩵;)Ll/ۨܶ᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩻ۙ᩵;->֫(Ll/ۨܶ᩵;)V

    return-object v0
.end method
