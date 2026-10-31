.class public final Ll/ᩴܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"


# instance fields
.field public final ֫:Ll/ۗ᩻᩵;

.field public final ۧ:Ll/᩷۠ᩴ;

.field public final ܽ:Ll/ۗ᩻᩵;

.field public final ܿ:Ll/᩹ᩴᩳ;

.field public final ᩳ:Ll/֡ᩴᩳ;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ll/ۗ᩻᩵;)V
    .locals 1

    .line 2485
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2482
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/ᩴܶᩳ;->ܽ:Ll/ۗ᩻᩵;

    .line 2484
    new-instance v0, Ll/֡ᩴᩳ;

    invoke-direct {v0}, Ll/֡ᩴᩳ;-><init>()V

    iput-object v0, p0, Ll/ᩴܶᩳ;->ᩳ:Ll/֡ᩴᩳ;

    .line 2486
    iput-object p1, p0, Ll/ᩴܶᩳ;->ۧ:Ll/᩷۠ᩴ;

    iput-object p2, p0, Ll/ᩴܶᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-static {p1}, Ll/᩹ᩴᩳ;->֫(Ll/᩷۠ᩴ;)Ll/᩹ᩴᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴܶᩳ;->ܿ:Ll/᩹ᩴᩳ;

    return-void
.end method
