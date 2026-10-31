.class public final Ll/ۤ᩺ᩳ;
.super Ljava/lang/Object;
.source "H6NE"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public ܽ:I

.field public ܿ:Ljava/lang/String;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    iput p1, p0, Ll/ۤ᩺ᩳ;->ᩳ:I

    .line 164
    iput p2, p0, Ll/ۤ᩺ᩳ;->֫:I

    .line 165
    iput p3, p0, Ll/ۤ᩺ᩳ;->ܽ:I

    .line 166
    iput p4, p0, Ll/ۤ᩺ᩳ;->ۧ:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 157
    iput p1, p0, Ll/ۤ᩺ᩳ;->ᩳ:I

    .line 158
    iput p2, p0, Ll/ۤ᩺ᩳ;->֫:I

    .line 159
    iput-object p3, p0, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    .line 160
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Ll/ۤ᩺ᩳ;->ۧ:I

    return-void
.end method
