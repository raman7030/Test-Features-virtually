.class public final Ll/᩻᩶ۡ;
.super Ljava/lang/Object;
.source "BBKO"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/᩷᩶ۡ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/᩷᩶ۡ;ILjava/lang/String;)V
    .locals 0

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, Ll/᩻᩶ۡ;->᩸:Ll/᩷᩶ۡ;

    .line 141
    iput p2, p0, Ll/᩻᩶ۡ;->᩹:I

    .line 142
    iput-object p3, p0, Ll/᩻᩶ۡ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 126
    check-cast p1, Ll/᩻᩶ۡ;

    .line 152
    iget-object v0, p0, Ll/᩻᩶ۡ;->᩸:Ll/᩷᩶ۡ;

    iget-object v1, p1, Ll/᩻᩶ۡ;->᩸:Ll/᩷᩶ۡ;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 156
    :cond_0
    iget v0, p0, Ll/᩻᩶ۡ;->᩹:I

    iget v1, p1, Ll/᩻᩶ۡ;->᩹:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 160
    :cond_1
    iget-object v0, p0, Ll/᩻᩶ۡ;->᩶:Ljava/lang/String;

    iget-object p1, p1, Ll/᩻᩶ۡ;->᩶:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
