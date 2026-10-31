.class public final Ll/᩶ۨᩳ;
.super Ljava/lang/Object;
.source "X68P"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/ۗ᩻᩵;

.field public final ܽ:Ll/ۗۤᩳ;

.field public final ܿ:I

.field public final ᩳ:Ll/ۙ֫ܿ;


# direct methods
.method public constructor <init>(Ll/ۙ֫ܿ;Ll/ۗۤᩳ;I)V
    .locals 1

    .line 7151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7149
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/᩶ۨᩳ;->ۧ:Ll/ۗ᩻᩵;

    .line 7152
    iput-object p1, p0, Ll/᩶ۨᩳ;->ᩳ:Ll/ۙ֫ܿ;

    iput-object p2, p0, Ll/᩶ۨᩳ;->ܽ:Ll/ۗۤᩳ;

    iput p3, p0, Ll/᩶ۨᩳ;->ܿ:I

    return-void
.end method
