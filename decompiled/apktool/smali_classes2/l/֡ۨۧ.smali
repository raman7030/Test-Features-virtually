.class public final Ll/֡ۨۧ;
.super Ljava/lang/Object;
.source "I5G9"


# instance fields
.field public final ֫:Landroid/util/SparseArray;

.field public final ۧ:Ll/ۚ᩵;

.field public final ܽ:Ll/ۖ᩵;

.field public final ᩳ:Ll/ۖ᩵;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    iput-object v0, p0, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    .line 29
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/֡ۨۧ;->֫:Landroid/util/SparseArray;

    .line 31
    new-instance v0, Ll/ۚ᩵;

    invoke-direct {v0}, Ll/ۚ᩵;-><init>()V

    iput-object v0, p0, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    .line 33
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    iput-object v0, p0, Ll/֡ۨۧ;->ܽ:Ll/ۖ᩵;

    return-void
.end method
