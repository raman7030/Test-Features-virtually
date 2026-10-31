.class public final Ll/֫᩺֡;
.super Ll/ۖ۟֡;
.source "398Q"


# instance fields
.field public final synthetic ᩸:Ll/ۧ᩺֡;


# direct methods
.method public constructor <init>(Ll/ۧ᩺֡;)V
    .locals 0

    .line 78
    iput-object p1, p0, Ll/֫᩺֡;->᩸:Ll/ۧ᩺֡;

    .line 43
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 88
    iget-object v0, p0, Ll/֫᩺֡;->᩸:Ll/ۧ᩺֡;

    iget v0, v0, Ll/۬ۛ֡;->ۧ:I

    return v0
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 3

    .line 82
    new-instance v0, Ll/۠ۛ֡;

    iget-object v1, p0, Ll/֫᩺֡;->᩸:Ll/ۧ᩺֡;

    invoke-virtual {v1, p1}, Ll/۬ۛ֡;->֫(I)I

    move-result v2

    .line 83
    invoke-virtual {v1, p1}, Ll/۬ۛ֡;->ۘ(I)I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Ll/۠ۛ֡;-><init>(Ll/۬ۛ֡;II)V

    return-object v0
.end method
