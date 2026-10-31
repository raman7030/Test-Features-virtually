.class public Ll/ۘۖ֫;
.super Ljava/lang/Object;
.source "63U1"

# interfaces
.implements Ll/ۛ᩺ۧ;


# static fields
.field public static final synthetic ۧ:I


# instance fields
.field public ֫:Ll/᩵ۖ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 173
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    const/4 v1, 0x5

    const/4 v2, 0x1

    .line 174
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const/4 v1, 0x6

    const/4 v3, 0x2

    .line 175
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    const/4 v1, 0x7

    .line 176
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    const/16 v1, 0x8

    .line 177
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const/16 v1, 0x9

    .line 179
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const/16 v1, 0xa

    .line 181
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 614
    instance-of v0, p1, Ll/ۘۖ֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 617
    :cond_0
    check-cast p1, Ll/ۘۖ֫;

    .line 618
    iget-object v0, p0, Ll/ۘۖ֫;->֫:Ll/᩵ۖ֫;

    if-nez v0, :cond_2

    .line 619
    iget-object p1, p1, Ll/ۘۖ֫;->֫:Ll/᩵ۖ֫;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1

    .line 621
    :cond_2
    iget-object p1, p1, Ll/ۘۖ֫;->֫:Ll/᩵ۖ֫;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 489
    iget-object v0, p0, Ll/ۘۖ֫;->֫:Ll/᩵ۖ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 494
    iget-object v0, p0, Ll/ۘۖ֫;->֫:Ll/᩵ۖ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
