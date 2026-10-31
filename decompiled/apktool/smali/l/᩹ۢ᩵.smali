.class public final Ll/᩹ۢ᩵;
.super Ll/ۙ᩷᩵;
.source "K9YL"


# static fields
.field public static final serialVersionUID:J = 0xf52a9538bcf62d4L


# instance fields
.field public final ۫:Ll/᩶ۢ᩵;


# direct methods
.method public constructor <init>(Ll/᩶ۢ᩵;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ll/ۙ᩷᩵;-><init>()V

    .line 87
    iput-object p1, p0, Ll/᩹ۢ᩵;->۫:Ll/᩶ۢ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۡۢ᩵;)V
    .locals 0

    .line 113
    invoke-super {p0, p1}, Ll/ۙ᩷᩵;->֫(Ll/ۡۢ᩵;)V

    return-void
.end method

.method public final ۧ(Ll/᩷ۡ᩵;)V
    .locals 0

    .line 189
    iput-object p1, p0, Ll/ۙ᩷᩵;->ۗ:Ll/֫ۡ᩵;

    .line 93
    iget-object p1, p0, Ll/ۙ᩷᩵;->ۗ:Ll/֫ۡ᩵;

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/᩹ۢ᩵;->۫:Ll/᩶ۢ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method
