.class public final Ll/֡ᩴ֫;
.super Ljava/lang/Object;
.source "28K4"


# instance fields
.field public ֫:Z

.field public final ۧ:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Ll/֡ᩴ֫;->ۧ:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۚᩴ֫;
    .locals 2

    .line 161
    iget-boolean v0, p0, Ll/֡ᩴ֫;->֫:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 162
    iput-boolean v1, p0, Ll/֡ᩴ֫;->֫:Z

    .line 163
    new-instance v0, Ll/ۚᩴ֫;

    iget-object v1, p0, Ll/֡ᩴ֫;->ۧ:Landroid/util/SparseBooleanArray;

    invoke-direct {v0, v1}, Ll/ۚᩴ֫;-><init>(Landroid/util/SparseBooleanArray;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 59
    iget-boolean v0, p0, Ll/֡ᩴ֫;->֫:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 60
    iget-object v0, p0, Ll/֡ᩴ֫;->ۧ:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->append(IZ)V

    return-void
.end method
