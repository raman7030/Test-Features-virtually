.class public final Ll/ܳᩴᩳ;
.super Ljava/lang/Object;
.source "Y6SG"


# instance fields
.field public final ֫:Ll/۬ᩴᩳ;

.field public final ۧ:Ll/ۗ᩻᩵;

.field public final ܽ:Z

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/۬ᩴᩳ;Z)V
    .locals 1

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/ܳᩴᩳ;->ۧ:Ll/ۗ᩻᩵;

    .line 212
    iput-object p1, p0, Ll/ܳᩴᩳ;->֫:Ll/۬ᩴᩳ;

    iput-boolean p2, p0, Ll/ܳᩴᩳ;->ܽ:Z

    return-void
.end method
