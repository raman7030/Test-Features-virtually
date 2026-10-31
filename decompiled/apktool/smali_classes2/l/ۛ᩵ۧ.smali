.class public final Ll/ۛ᩵ۧ;
.super Ljava/lang/Object;
.source "E8SE"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:I

.field public final ᩹:Ll/ۙ᩵ۧ;


# direct methods
.method public constructor <init>(ILl/ۙ᩵ۧ;)V
    .locals 0

    .line 925
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 926
    iput p1, p0, Ll/ۛ᩵ۧ;->᩸:I

    .line 927
    iput-object p2, p0, Ll/ۛ᩵ۧ;->᩹:Ll/ۙ᩵ۧ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 920
    check-cast p1, Ll/ۛ᩵ۧ;

    .line 932
    iget v0, p0, Ll/ۛ᩵ۧ;->᩸:I

    iget p1, p1, Ll/ۛ᩵ۧ;->᩸:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
