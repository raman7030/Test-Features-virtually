.class public final Ll/ۘۧ֡;
.super Ljava/lang/Object;
.source "I4F9"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ll/֡ۧ֡;

.field public ܳ:Ll/ۛܽ֡;

.field public ܽ:I

.field public ܿ:Ljava/net/Socket;

.field public ᩳ:Ll/ۤܽ֡;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 614
    sget-object v0, Ll/֡ۧ֡;->֫:Ll/֡ۧ֡;

    iput-object v0, p0, Ll/ۘۧ֡;->ۧ:Ll/֡ۧ֡;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩹ۧ֡;
    .locals 1

    .line 657
    new-instance v0, Ll/᩹ۧ֡;

    invoke-direct {v0, p0}, Ll/᩹ۧ֡;-><init>(Ll/ۘۧ֡;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 652
    iput p1, p0, Ll/ۘۧ֡;->ܽ:I

    return-void
.end method

.method public final ֫(Ljava/net/Socket;Ljava/lang/String;Ll/ۛܽ֡;Ll/ۤܽ֡;)V
    .locals 0

    .line 634
    iput-object p1, p0, Ll/ۘۧ֡;->ܿ:Ljava/net/Socket;

    .line 635
    iput-object p2, p0, Ll/ۘۧ֡;->֫:Ljava/lang/String;

    .line 636
    iput-object p3, p0, Ll/ۘۧ֡;->ܳ:Ll/ۛܽ֡;

    .line 637
    iput-object p4, p0, Ll/ۘۧ֡;->ᩳ:Ll/ۤܽ֡;

    return-void
.end method

.method public final ֫(Ll/᩻֫֡;)V
    .locals 0

    .line 642
    iput-object p1, p0, Ll/ۘۧ֡;->ۧ:Ll/֡ۧ֡;

    return-void
.end method
