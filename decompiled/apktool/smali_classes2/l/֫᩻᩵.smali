.class public final Ll/֫᩻᩵;
.super Ljava/lang/Object;
.source "11N5"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x80

    new-array v1, v0, [I

    .line 13
    sput-object v1, Ll/֫᩻᩵;->ۧ:[I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    sget-object v2, Ll/֫᩻᩵;->ۧ:[I

    invoke-static {v1}, Ljava/lang/Character;->getType(I)I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(I)I
    .locals 1

    const/16 v0, 0x80

    if-ge p0, v0, :cond_0

    .line 27
    sget-object v0, Ll/֫᩻᩵;->ۧ:[I

    aget p0, v0, p0

    return p0

    .line 29
    :cond_0
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    return p0
.end method
