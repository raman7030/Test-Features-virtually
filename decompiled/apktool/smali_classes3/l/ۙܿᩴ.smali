.class public Ll/ۙܿᩴ;
.super Ll/۫ܿᩴ;
.source "21QH"

# interfaces
.implements Ljava/util/RandomAccess;


# static fields
.field public static final serialVersionUID:J = -0x17c644f4f4567f9L


# virtual methods
.method public final subList(II)Ll/֨ۡᩴ;
    .locals 4

    .line 841
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 842
    invoke-virtual {p0, p2}, Ll/ۤܿᩴ;->֫(I)V

    if-gt p1, p2, :cond_0

    .line 846
    new-instance v0, Ll/ۙܿᩴ;

    .line 836
    invoke-direct {v0, p0, p1, p2}, Ll/۫ܿᩴ;-><init>(Ll/ۤܿᩴ;II)V

    return-object v0

    .line 843
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, ") is greater than end index ("

    const-string v2, ")"

    const-string v3, "Start index ("

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 843
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
