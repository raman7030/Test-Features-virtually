.class public final Ll/ۧᩴܽ;
.super Ljava/lang/Object;
.source "W6QR"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public ۧ:I

.field public final ܽ:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 646
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 647
    invoke-static {p1}, Ll/᩷ᩴܽ;->֫(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    .line 648
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۧᩴܽ;->֫:Ljava/lang/String;

    .line 649
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩷ᩴܽ;->ۧ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۧᩴܽ;->ܽ:[Ljava/lang/String;

    return-void
.end method
