.class public final synthetic Ll/ܿ۫ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/֨۠ۜ;

.field public final synthetic ۙ:Ll/ܶ۠֫;

.field public final synthetic ۛ:Z

.field public final synthetic ۤ:Ll/ۘ᩶֫;

.field public final synthetic ۫:I

.field public final synthetic ۬:I

.field public final synthetic ᩶:Landroid/net/Uri;

.field public final synthetic ᩸:Ll/ۤۤۜ;

.field public final synthetic ᩹:Ll/᩻۬ۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۤۜ;Ll/᩻۬ۜ;Landroid/net/Uri;Ll/ܶ۠֫;Ll/֨۠ۜ;IILl/ۘ᩶֫;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۫ۜ;->᩸:Ll/ۤۤۜ;

    iput-object p2, p0, Ll/ܿ۫ۜ;->᩹:Ll/᩻۬ۜ;

    iput-object p3, p0, Ll/ܿ۫ۜ;->᩶:Landroid/net/Uri;

    iput-object p4, p0, Ll/ܿ۫ۜ;->ۙ:Ll/ܶ۠֫;

    iput-object p5, p0, Ll/ܿ۫ۜ;->ۗ:Ll/֨۠ۜ;

    iput p6, p0, Ll/ܿ۫ۜ;->۬:I

    iput p7, p0, Ll/ܿ۫ۜ;->۫:I

    iput-object p8, p0, Ll/ܿ۫ۜ;->ۤ:Ll/ۘ᩶֫;

    iput-boolean p9, p0, Ll/ܿ۫ۜ;->ۛ:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 2
    sget v0, Ll/ۤۤۜ;->᩻ܿ:I

    .line 1444
    iget-object v0, p0, Ll/ܿ۫ۜ;->᩹:Ll/᩻۬ۜ;

    iget-object v1, p0, Ll/ܿ۫ۜ;->᩶:Landroid/net/Uri;

    iget-object v2, p0, Ll/ܿ۫ۜ;->ۙ:Ll/ܶ۠֫;

    iget-object v3, p0, Ll/ܿ۫ۜ;->ۗ:Ll/֨۠ۜ;

    invoke-static {v0, v1, v2, v3}, Ll/ܺ۠ۜ;->֫(Ll/᩻۬ۜ;Landroid/net/Uri;Ll/ܶ۠֫;Ll/֨۠ۜ;)Ll/ܺ۠ۜ;

    move-result-object v8

    .line 1446
    new-instance v0, Ll/ۡ۫ۜ;

    iget-object v5, p0, Ll/ܿ۫ۜ;->᩸:Ll/ۤۤۜ;

    iget v6, p0, Ll/ܿ۫ۜ;->۬:I

    iget v7, p0, Ll/ܿ۫ۜ;->۫:I

    iget-object v9, p0, Ll/ܿ۫ۜ;->ۤ:Ll/ۘ᩶֫;

    iget-boolean v10, p0, Ll/ܿ۫ۜ;->ۛ:Z

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Ll/ۡ۫ۜ;-><init>(Ll/ۤۤۜ;IILl/ܺ۠ۜ;Ll/ۘ᩶֫;Z)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
