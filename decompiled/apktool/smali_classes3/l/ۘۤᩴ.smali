.class public final Ll/ۘۤᩴ;
.super Ll/᩻ۤᩴ;
.source "N673"

# interfaces
.implements Ljava/util/Iterator;
.implements Ljava/util/Enumeration;


# instance fields
.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>([Ll/֡ۤᩴ;IILl/ۧۤᩴ;I)V
    .locals 0

    iput p5, p0, Ll/ۘۤᩴ;->k:I

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩻ۤᩴ;-><init>([Ll/֡ۤᩴ;IILl/ۧۤᩴ;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll/ۘۤᩴ;->k:I

    packed-switch v0, :pswitch_data_0

    .line 3475
    iget-object v0, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    if-eqz v0, :cond_1

    .line 3477
    iget-object v1, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    .line 3478
    iput-object v0, p0, Ll/᩻ۤᩴ;->j:Ll/֡ۤᩴ;

    .line 3479
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    return-object v1

    .line 3455
    :pswitch_0
    iget-object v0, p0, Ll/ܶۤᩴ;->b:Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    .line 3457
    iget-object v1, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    .line 3458
    iput-object v0, p0, Ll/᩻ۤᩴ;->j:Ll/֡ۤᩴ;

    .line 3459
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    return-object v1

    .line 3456
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 3476
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final nextElement()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll/ۘۤᩴ;->k:I

    packed-switch v0, :pswitch_data_0

    .line 3483
    invoke-virtual {p0}, Ll/ۘۤᩴ;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 3463
    :pswitch_0
    invoke-virtual {p0}, Ll/ۘۤᩴ;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
