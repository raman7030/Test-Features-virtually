.class public final Ll/ۘ۫ۧ;
.super Ljava/lang/Object;
.source "R68J"


# static fields
.field public static ᩳ:Ll/ۨۤ;


# instance fields
.field public ֫:I

.field public ۧ:Ll/ۨۗۧ;

.field public ܽ:Ll/ۨۗۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 307
    new-instance v0, Ll/ۨۤ;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ll/ۨۤ;-><init>(I)V

    sput-object v0, Ll/ۘ۫ۧ;->ᩳ:Ll/ۨۤ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()Ll/ۘ۫ۧ;
    .locals 1

    .line 313
    sget-object v0, Ll/ۘ۫ۧ;->ᩳ:Ll/ۨۤ;

    invoke-virtual {v0}, Ll/ۨۤ;->֫()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ۫ۧ;

    if-nez v0, :cond_0

    .line 314
    new-instance v0, Ll/ۘ۫ۧ;

    invoke-direct {v0}, Ll/ۘ۫ۧ;-><init>()V

    :cond_0
    return-object v0
.end method
