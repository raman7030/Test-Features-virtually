.class public final Ll/᩵ۜۧ;
.super Ljava/lang/Object;
.source "J8TG"


# instance fields
.field public final ֫:Ll/ۘۜۧ;

.field public final ۧ:Ll/ۘۜۧ;

.field public final ܽ:Z

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۘۜۧ;Ll/ۘۜۧ;I)V
    .locals 0

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    iput-object p1, p0, Ll/᩵ۜۧ;->֫:Ll/ۘۜۧ;

    .line 194
    iput-object p2, p0, Ll/᩵ۜۧ;->ۧ:Ll/ۘۜۧ;

    .line 195
    iput p3, p0, Ll/᩵ۜۧ;->ᩳ:I

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 196
    :goto_0
    iput-boolean p1, p0, Ll/᩵ۜۧ;->ܽ:Z

    return-void
.end method
