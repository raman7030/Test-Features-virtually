.class public final Ll/֡۫;
.super Ljava/lang/Object;
.source "RCE9"

# interfaces
.implements Ll/᩵۫;


# instance fields
.field public final ֫:Landroid/os/LocaleList;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    check-cast p1, Landroid/os/LocaleList;

    iput-object p1, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 62
    iget-object v0, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    check-cast p1, Ll/᩵۫;

    invoke-interface {p1}, Ll/᩵۫;->ۧ()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/util/Locale;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    invoke-virtual {v0, p1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 47
    iget-object v0, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final size()I
    .locals 1

    .line 52
    iget-object v0, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/֡۫;->֫:Landroid/os/LocaleList;

    return-object v0
.end method
