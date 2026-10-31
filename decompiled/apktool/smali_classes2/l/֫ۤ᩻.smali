.class public final Ll/֫ۤ᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ll/ܶᩴܺ;


# instance fields
.field public final synthetic ֫:Ll/ۗܺ᩷;

.field public final synthetic ۧ:Ll/֡ۚۢ;

.field public final synthetic ܽ:Ll/ۗۘ;

.field public final synthetic ܿ:[Z

.field public final synthetic ᩳ:Ll/۠᩶᩷;


# direct methods
.method public constructor <init>([ZLl/۠᩶᩷;Ll/ۗܺ᩷;Ll/֡ۚۢ;Ll/ۗۘ;)V
    .locals 0

    .line 600
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۤ᩻;->ܿ:[Z

    iput-object p2, p0, Ll/֫ۤ᩻;->ᩳ:Ll/۠᩶᩷;

    iput-object p3, p0, Ll/֫ۤ᩻;->֫:Ll/ۗܺ᩷;

    iput-object p4, p0, Ll/֫ۤ᩻;->ۧ:Ll/֡ۚۢ;

    iput-object p5, p0, Ll/֫ۤ᩻;->ܽ:Ll/ۗۘ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 620
    iget-object v0, p0, Ll/֫ۤ᩻;->ܿ:[Z

    const/4 v1, 0x0

    aget-boolean v2, v0, v1

    if-nez v2, :cond_0

    goto :goto_0

    .line 623
    :cond_0
    aput-boolean v1, v0, v1

    .line 624
    iget-object v0, p0, Ll/֫ۤ᩻;->֫:Ll/ۗܺ᩷;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Runnable;)V

    .line 625
    iget-object v0, p0, Ll/֫ۤ᩻;->ᩳ:Ll/۠᩶᩷;

    if-eqz v0, :cond_1

    .line 626
    invoke-virtual {v0, v1}, Ll/۠᩶᩷;->ۧ(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()V
    .locals 9

    .line 603
    iget-object v1, p0, Ll/֫ۤ᩻;->ܿ:[Z

    const/4 v0, 0x0

    const/4 v2, 0x1

    aput-boolean v2, v1, v0

    .line 604
    iget-object v0, p0, Ll/֫ۤ᩻;->ᩳ:Ll/۠᩶᩷;

    if-eqz v0, :cond_0

    .line 605
    invoke-virtual {v0, v2}, Ll/۠᩶᩷;->ۧ(Z)V

    .line 607
    :cond_0
    new-instance v7, Ll/۟۫᩻;

    const/4 v6, 0x0

    iget-object v2, p0, Ll/֫ۤ᩻;->ᩳ:Ll/۠᩶᩷;

    iget-object v3, p0, Ll/֫ۤ᩻;->ۧ:Ll/֡ۚۢ;

    iget-object v8, p0, Ll/֫ۤ᩻;->֫:Ll/ۗܺ᩷;

    iget-object v5, p0, Ll/֫ۤ᩻;->ܽ:Ll/ۗۘ;

    move-object v0, v7

    move-object v4, v8

    invoke-direct/range {v0 .. v6}, Ll/۟۫᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Ll/ۗܺ᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
