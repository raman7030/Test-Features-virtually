.class public final synthetic Ll/ۢ۫ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ۗܺ᩷;

.field public final synthetic ۧ:Ll/ᩳۜܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ۫ۜ;->֫:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۢ۫ۜ;->ۧ:Ll/ᩳۜܳ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 2
    sget v0, Ll/ۤۤۜ;->᩻ܿ:I

    .line 328
    iget-object v0, p0, Ll/ۢ۫ۜ;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    iget-object v1, p0, Ll/ۢ۫ۜ;->֫:Ll/ۗܺ᩷;

    invoke-static {v1, v0}, Ll/᩵ۗۜ;->֫(Landroid/content/Context;Ll/ܶ᩵ܿ;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
