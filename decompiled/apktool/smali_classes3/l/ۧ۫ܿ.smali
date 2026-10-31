.class public final synthetic Ll/ۧ۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:[Ljava/lang/Runnable;

.field public final synthetic ۙ:Landroid/view/View;

.field public final synthetic ᩶:[Z

.field public final synthetic ᩸:[J

.field public final synthetic ᩹:Ll/᩹۫ܿ;


# direct methods
.method public synthetic constructor <init>([JLl/᩹۫ܿ;[ZLandroid/view/View;[Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ۫ܿ;->᩸:[J

    iput-object p2, p0, Ll/ۧ۫ܿ;->᩹:Ll/᩹۫ܿ;

    iput-object p3, p0, Ll/ۧ۫ܿ;->᩶:[Z

    iput-object p4, p0, Ll/ۧ۫ܿ;->ۙ:Landroid/view/View;

    iput-object p5, p0, Ll/ۧ۫ܿ;->ۗ:[Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 116
    invoke-static {}, Ll/֫ۚۢ;->᩻()J

    move-result-wide v0

    .line 117
    iget-object v2, p0, Ll/ۧ۫ܿ;->᩸:[J

    const/4 v3, 0x0

    aget-wide v4, v2, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 118
    iget-object v2, p0, Ll/ۧ۫ܿ;->᩹:Ll/᩹۫ܿ;

    invoke-virtual {v2, v4, v5, v0, v1}, Ll/᩹۫ܿ;->֫(JJ)V

    .line 119
    iget-object v0, p0, Ll/ۧ۫ܿ;->᩶:[Z

    aget-boolean v0, v0, v3

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۧ۫ܿ;->ۙ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    .line 120
    iget-object v0, p0, Ll/ۧ۫ܿ;->ۗ:[Ljava/lang/Runnable;

    aget-object v0, v0, v3

    const-wide/16 v3, 0xc8

    invoke-virtual {v2, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
