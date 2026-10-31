.class public final synthetic Ll/᩵ۙ֫;
.super Ljava/lang/Object;
.source "V8T2"

# interfaces
.implements Ll/᩹᩻ۧ;


# instance fields
.field public final synthetic ᩸:Ll/᩶ۙ֫;

.field public final synthetic ᩹:Ll/᩹᩻ۧ;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۙ֫;Ll/᩹᩻ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۙ֫;->᩸:Ll/᩶ۙ֫;

    iput-object p2, p0, Ll/᩵ۙ֫;->᩹:Ll/᩹᩻ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V
    .locals 8

    .line 2
    iget-object v0, p0, Ll/᩵ۙ֫;->᩸:Ll/᩶ۙ֫;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    iget-object v1, p0, Ll/᩵ۙ֫;->᩹:Ll/᩹᩻ۧ;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Ll/᩹᩻ۧ;->֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    .line 363
    invoke-virtual/range {v0 .. v6}, Ll/᩶ۙ֫;->֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V

    return-void
.end method
