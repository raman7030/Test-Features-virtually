.class public final Ll/ۙ᩶;
.super Ljava/lang/Object;
.source "G3SY"


# instance fields
.field public ֫:Z

.field public final ۧ:Landroid/content/ComponentName;

.field public ܽ:I

.field public ܿ:Ljava/util/ArrayDeque;

.field public ᩳ:Ll/ܽ;


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;)V
    .locals 2

    .line 1147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1139
    iput-boolean v0, p0, Ll/ۙ᩶;->֫:Z

    .line 1143
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Ll/ۙ᩶;->ܿ:Ljava/util/ArrayDeque;

    .line 1145
    iput v0, p0, Ll/ۙ᩶;->ܽ:I

    .line 1148
    iput-object p1, p0, Ll/ۙ᩶;->ۧ:Landroid/content/ComponentName;

    return-void
.end method
