.class public final Ll/ۤۧ;
.super Ljava/lang/Object;
.source "V22O"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/ܶᩳ;

.field public final synthetic ᩸:Ll/ۨۧ;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/ۨۧ;ILl/ܶᩳ;)V
    .locals 0

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۧ;->᩸:Ll/ۨۧ;

    iput p2, p0, Ll/ۤۧ;->᩹:I

    iput-object p3, p0, Ll/ۤۧ;->᩶:Ll/ܶᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 190
    iget-object v0, p0, Ll/ۤۧ;->᩶:Ll/ܶᩳ;

    invoke-virtual {v0}, Ll/ܶᩳ;->֫()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll/ۤۧ;->᩸:Ll/ۨۧ;

    iget v2, p0, Ll/ۤۧ;->᩹:I

    invoke-virtual {v1, v2, v0}, Ll/᩵ᩳ;->֫(ILjava/lang/Object;)V

    return-void
.end method
