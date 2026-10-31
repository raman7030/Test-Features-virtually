.class public final Ll/ܿᩴܳ;
.super Ljava/lang/Object;
.source "OAYY"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I

.field public final ܽ:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 0

    .line 930
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 931
    iput p1, p0, Ll/ܿᩴܳ;->ۧ:I

    .line 932
    iput-boolean p3, p0, Ll/ܿᩴܳ;->ܽ:Z

    .line 933
    iput-object p2, p0, Ll/ܿᩴܳ;->֫:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONArray;)V
    .locals 3

    const/4 v0, 0x0

    .line 943
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONArray;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    .line 944
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONArray;->getBoolean(I)Z

    move-result v1

    const/4 v2, 0x2

    .line 945
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "getString(...)"

    invoke-static {p1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 942
    invoke-direct {p0, v0, p1, v1}, Ll/ܿᩴܳ;-><init>(ILjava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩻᩻;Z)V
    .locals 2

    .line 937
    iget v0, p1, Ll/ۗ᩻᩻;->᩶:I

    .line 939
    invoke-virtual {p1}, Ll/ۗ᩻᩻;->֫()Ljava/lang/String;

    move-result-object p1

    const-string v1, "getBackupTag(...)"

    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 936
    invoke-direct {p0, v0, p1, p2}, Ll/ܿᩴܳ;-><init>(ILjava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 0
    :cond_0
    instance-of v1, p1, Ll/ܿᩴܳ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll/ܿᩴܳ;

    iget v1, p0, Ll/ܿᩴܳ;->ۧ:I

    iget v3, p1, Ll/ܿᩴܳ;->ۧ:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ll/ܿᩴܳ;->ܽ:Z

    iget-boolean v3, p1, Ll/ܿᩴܳ;->ܽ:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ll/ܿᩴܳ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ܿᩴܳ;->֫:Ljava/lang/String;

    invoke-static {v1, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 2
    iget v0, p0, Ll/ܿᩴܳ;->ۧ:I

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    iget-boolean v1, p0, Ll/ܿᩴܳ;->ܽ:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-object v1, p0, Ll/ܿᩴܳ;->֫:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NetworkStorageInfo(id="

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    iget v1, p0, Ll/ܿᩴܳ;->ۧ:I

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isDir="

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    iget-boolean v1, p0, Ll/ܿᩴܳ;->ܽ:Z

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", backupTag="

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    .line 0
    iget-object v2, p0, Ll/ܿᩴܳ;->֫:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 933
    iget-object v0, p0, Ll/ܿᩴܳ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩻᩻;)Ll/ܿᩴܳ;
    .locals 2

    .line 953
    new-instance v0, Ll/ܿᩴܳ;

    iget-boolean v1, p0, Ll/ܿᩴܳ;->ܽ:Z

    invoke-direct {v0, p1, v1}, Ll/ܿᩴܳ;-><init>(Ll/ۗ᩻᩻;Z)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 931
    iget v0, p0, Ll/ܿᩴܳ;->ۧ:I

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 932
    iget-boolean v0, p0, Ll/ܿᩴܳ;->ܽ:Z

    return v0
.end method

.method public final ᩳ()Lbin/mt/json/JSONArray;
    .locals 2

    .line 957
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    .line 958
    iget v1, p0, Ll/ܿᩴܳ;->ۧ:I

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(I)Lbin/mt/json/JSONArray;

    .line 959
    iget-boolean v1, p0, Ll/ܿᩴܳ;->ܽ:Z

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Z)Lbin/mt/json/JSONArray;

    .line 960
    iget-object v1, p0, Ll/ܿᩴܳ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    return-object v0
.end method
