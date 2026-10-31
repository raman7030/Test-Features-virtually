.class public final Ll/۠ۨ֫;
.super Ljava/lang/Object;
.source "A7N6"


# instance fields
.field public final ֫:Z

.field public final ۧ:J

.field public final ܽ:I

.field public final ᩳ:Ll/᩹᩺֫;


# direct methods
.method public constructor <init>(Ll/᩹᩺֫;JI)V
    .locals 0

    .line 1054
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1055
    iput-object p1, p0, Ll/۠ۨ֫;->ᩳ:Ll/᩹᩺֫;

    .line 1056
    iput-wide p2, p0, Ll/۠ۨ֫;->ۧ:J

    .line 1057
    iput p4, p0, Ll/۠ۨ֫;->ܽ:I

    .line 1058
    instance-of p2, p1, Ll/۠᩺֫;

    if-eqz p2, :cond_0

    check-cast p1, Ll/۠᩺֫;

    iget-boolean p1, p1, Ll/۠᩺֫;->۟:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/۠ۨ֫;->֫:Z

    return-void
.end method
