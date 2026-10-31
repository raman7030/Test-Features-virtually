.class public final synthetic Ll/֫ܿܳ;
.super Ljava/lang/Object;
.source "K6ZG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ۫:I

.field public final synthetic ۬:Ljava/lang/String;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/ܳܿܳ;

.field public final synthetic ᩹:Landroid/content/res/AssetManager;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/res/AssetManager;Ll/ܳܿܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/֫ܿܳ;->᩸:Ll/ܳܿܳ;

    iput-object p2, p0, Ll/֫ܿܳ;->᩹:Landroid/content/res/AssetManager;

    iput-object p4, p0, Ll/֫ܿܳ;->᩶:Ljava/lang/String;

    iput-object p5, p0, Ll/֫ܿܳ;->ۙ:Ljava/lang/String;

    iput-boolean p7, p0, Ll/֫ܿܳ;->ۗ:Z

    iput-object p6, p0, Ll/֫ܿܳ;->۬:Ljava/lang/String;

    iput p1, p0, Ll/֫ܿܳ;->۫:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 0
    iget-object v5, p0, Ll/֫ܿܳ;->۬:Ljava/lang/String;

    iget v0, p0, Ll/֫ܿܳ;->۫:I

    iget-object v1, p0, Ll/֫ܿܳ;->᩹:Landroid/content/res/AssetManager;

    iget-object v2, p0, Ll/֫ܿܳ;->᩸:Ll/ܳܿܳ;

    iget-object v3, p0, Ll/֫ܿܳ;->᩶:Ljava/lang/String;

    iget-object v4, p0, Ll/֫ܿܳ;->ۙ:Ljava/lang/String;

    iget-boolean v6, p0, Ll/֫ܿܳ;->ۗ:Z

    invoke-static/range {v0 .. v6}, Ll/ܳܿܳ;->֫(ILandroid/content/res/AssetManager;Ll/ܳܿܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
