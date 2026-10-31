.class public final Ll/ᩴ֡᩻;
.super Ljava/lang/Object;
.source "7A0X"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/ۧۢ᩻;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-virtual {p1}, Ll/ۧۢ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ֡᩻;->ۧ:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Ll/ۧۢ᩻;->֫()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ֡᩻;->֫:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Ll/ۧۢ᩻;->ܽ()I

    move-result p1

    iput p1, p0, Ll/ᩴ֡᩻;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ᩴ֡᩻;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ᩴ֡᩻;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 71
    iget v0, p0, Ll/ᩴ֡᩻;->ܽ:I

    return v0
.end method
