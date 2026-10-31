.class public final Ll/᩶ۗ֫;
.super Ljava/lang/Object;
.source "98TD"

# interfaces
.implements Ll/᩷ۗ֫;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۧ:I

.field public ܽ:Z

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:Ll/᩻ۧۧ;


# direct methods
.method public constructor <init>(Ll/ۘۧۧ;Z)V
    .locals 1

    .line 512
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 513
    new-instance v0, Ll/᩻ۧۧ;

    invoke-direct {v0, p1, p2}, Ll/᩻ۧۧ;-><init>(Ll/ۘۧۧ;Z)V

    iput-object v0, p0, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    .line 514
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩶ۗ֫;->֫:Ljava/util/ArrayList;

    .line 515
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۗ֫;->ܿ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getUid()Ljava/lang/Object;
    .locals 1

    .line 526
    iget-object v0, p0, Ll/᩶ۗ֫;->ܿ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫()Ll/ۙ᩵֫;
    .locals 1

    .line 531
    iget-object v0, p0, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    invoke-virtual {v0}, Ll/᩻ۧۧ;->ܺ()Ll/ۙ᩵֫;

    move-result-object v0

    return-object v0
.end method
