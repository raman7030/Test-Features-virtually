.class public final Ll/ۤ᩹ᩳ;
.super Ljava/lang/Object;
.source "H6V3"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۙ:Ll/᩺᩹ᩳ;

.field public final ᩶:Ll/᩶᩹ᩳ;

.field public final ᩸:[C

.field public final ᩹:I


# direct methods
.method public constructor <init>([CLl/᩶᩹ᩳ;ILl/᩺᩹ᩳ;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p4, p0, Ll/ۤ᩹ᩳ;->ۙ:Ll/᩺᩹ᩳ;

    .line 160
    iput-object p1, p0, Ll/ۤ᩹ᩳ;->᩸:[C

    .line 161
    iput-object p2, p0, Ll/ۤ᩹ᩳ;->᩶:Ll/᩶᩹ᩳ;

    .line 162
    iput p3, p0, Ll/ۤ᩹ᩳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ۤ᩹ᩳ;->ۙ:Ll/᩺᩹ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩺᩹ᩳ;->close()V

    :cond_0
    return-void
.end method
