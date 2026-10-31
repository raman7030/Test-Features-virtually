.class public final synthetic Ll/ܿۗۜ;
.super Ljava/lang/Object;
.source "274A"

# interfaces
.implements Ll/ܶ۠֫;


# instance fields
.field public final synthetic ۙ:Z

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/᩻۬ۜ;

.field public final synthetic ᩹:Ll/ۢۗۜ;


# direct methods
.method public synthetic constructor <init>(Ll/᩻۬ۜ;Ll/ۢۗۜ;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۗۜ;->᩸:Ll/᩻۬ۜ;

    iput-object p2, p0, Ll/ܿۗۜ;->᩹:Ll/ۢۗۜ;

    iput-object p3, p0, Ll/ܿۗۜ;->᩶:Ljava/lang/String;

    iput-boolean p4, p0, Ll/ܿۗۜ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩸۠֫;
    .locals 5

    .line 126
    new-instance v0, Ll/ۜۗۜ;

    iget-object v1, p0, Ll/ܿۗۜ;->᩸:Ll/᩻۬ۜ;

    iget-object v2, p0, Ll/ܿۗۜ;->᩹:Ll/ۢۗۜ;

    iget-object v3, p0, Ll/ܿۗۜ;->᩶:Ljava/lang/String;

    iget-boolean v4, p0, Ll/ܿۗۜ;->ۙ:Z

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۜۗۜ;-><init>(Ll/᩻۬ۜ;Ll/ۢۗۜ;Ljava/lang/String;Z)V

    return-object v0
.end method
