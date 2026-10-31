.class public abstract Ll/ۚۙ֡;
.super Ljava/lang/Object;
.source "H586"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩶:I

.field public final ᩸:Ll/ۗ᩶֡;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 40
    iput v0, p0, Ll/ۚۙ֡;->᩶:I

    .line 45
    iput v0, p0, Ll/ۚۙ֡;->᩹:I

    .line 60
    iput-object p1, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 133
    invoke-virtual {p0}, Ll/ۚۙ֡;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(I)I
.end method

.method public abstract ֫()Ljava/lang/String;
.end method

.method public abstract ֫(Ll/֫ۗ֡;)V
.end method

.method public final ֫(Ll/ۧۗ֡;ILl/۫ۙ֡;)V
    .locals 1

    .line 75
    :try_start_0
    invoke-virtual {p1}, Ll/ۧۗ֡;->֫()I

    move-result v0

    iput v0, p0, Ll/ۚۙ֡;->᩶:I

    .line 76
    iput p2, p0, Ll/ۚۙ֡;->᩹:I

    .line 78
    invoke-virtual {p0, p1, p3}, Ll/ۚۙ֡;->֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 184
    invoke-virtual {p0}, Ll/ۚۙ֡;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    .line 80
    throw p1
.end method

.method public abstract ֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
.end method

.method public final ۧ(II)I
    .locals 0

    .line 96
    :try_start_0
    iput p1, p0, Ll/ۚۙ֡;->᩶:I

    .line 97
    iput p2, p0, Ll/ۚۙ֡;->᩹:I

    .line 98
    invoke-virtual {p0, p1}, Ll/ۚۙ֡;->֫(I)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 184
    invoke-virtual {p0}, Ll/ۚۙ֡;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    .line 100
    throw p1
.end method

.method public final ۧ()Ll/ۗ᩶֡;
    .locals 1

    .line 216
    iget-object v0, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;)V
    .locals 1

    .line 119
    :try_start_0
    invoke-virtual {p1}, Ll/֫ۗ֡;->ۧ()V

    .line 120
    invoke-virtual {p0, p1}, Ll/ۚۙ֡;->֫(Ll/֫ۗ֡;)V

    .line 121
    invoke-virtual {p1}, Ll/֫ۗ֡;->֫()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 184
    invoke-virtual {p0}, Ll/ۚۙ֡;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    .line 123
    throw p1
.end method

.method public final ܿ()I
    .locals 1

    .line 209
    iget v0, p0, Ll/ۚۙ֡;->᩹:I

    return v0
.end method
