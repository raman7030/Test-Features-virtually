.class public final Ll/᩷᩹ۖ;
.super Ljava/lang/Object;
.source "058F"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:I

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 674
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 675
    iput-object p1, p0, Ll/᩷᩹ۖ;->᩹:Ljava/lang/String;

    .line 676
    iput p2, p0, Ll/᩷᩹ۖ;->᩸:I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 670
    check-cast p1, Ll/᩷᩹ۖ;

    .line 681
    iget-object v0, p0, Ll/᩷᩹ۖ;->᩹:Ljava/lang/String;

    iget-object p1, p1, Ll/᩷᩹ۖ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
